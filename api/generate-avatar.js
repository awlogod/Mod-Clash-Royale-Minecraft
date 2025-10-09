
// api/generate-avatar.js

export default async function handler(req, res) {
    if (req.method !== "POST") {
      return res.status(405).json({ error: "Method not allowed" });
    }
  
    try {
      const { image } = req.body;
  
      if (!image) {
        return res.status(400).json({ error: "Missing image URL" });
      }
  
      // Chamada para a API da Replicate
      const response = await fetch("https://api.replicate.com/v1/predictions", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
          Authorization: `Token ${process.env.REPLICATE_API_TOKEN}`,
        },
        body: JSON.stringify({
          version: "d8e8e098d0d34a9b97c7f0daae7efdb3b9d6e2b6a17e81d2b40bcae22b7cfb12", // modelo (exemplo)
          input: {
            image: image,
            prompt: "futuristic portrait, cinematic lighting, sci-fi background",
          },
        }),
      });
  
      const result = await response.json();
  
      if (result.error) {
        return res.status(500).json({ error: result.error });
      }
  
      // Retorna o link da imagem gerada
      return res.status(200).json({
        success: true,
        output: result,
      });
    } catch (error) {
      console.error("Erro no proxy:", error);
      return res.status(500).json({ error: "Internal Server Error" });
    }
  }
  