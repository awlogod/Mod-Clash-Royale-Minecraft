# Instruções de Build

## Pré-requisitos

1. **Java 17** ou superior instalado
2. **Gradle** (será baixado automaticamente pelo wrapper)

## Passos para Build

### 1. Preparar o ambiente

Certifique-se de que você tem Java 17 instalado:
```bash
java -version
```

### 2. Executar o build

**No Windows:**
```bash
gradlew.bat build
```

**No Linux/Mac:**
```bash
chmod +x gradlew
./gradlew build
```

### 3. Encontrar o arquivo JAR

Após o build bem-sucedido, o arquivo `.jar` do mod estará em:
```
build/libs/clashroyale-mod-1.0.0.jar
```

### 4. Instalar o mod

1. Instale o Minecraft Forge 1.19.2 (versão 43.2.0 ou superior)
2. Copie o arquivo `.jar` para a pasta `mods` do seu Minecraft
3. Inicie o jogo!

## Executar no ambiente de desenvolvimento

Para testar o mod durante o desenvolvimento:

**Windows:**
```bash
gradlew.bat runClient
```

**Linux/Mac:**
```bash
./gradlew runClient
```

## Resolução de Problemas

### Erros de compilação
- Certifique-se de que está usando Java 17
- Verifique se o Forge está na versão correta (43.2.0)

### Dependências não encontradas
- O Gradle baixará automaticamente as dependências na primeira execução
- Isso pode levar alguns minutos na primeira vez

### Mod não aparece no jogo
- Verifique se o arquivo está na pasta `mods` correta
- Certifique-se de que o Forge está instalado corretamente
- Verifique os logs do Minecraft para erros

