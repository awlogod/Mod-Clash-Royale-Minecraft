# Clash Royale Mod para Minecraft

Um mod completo para Minecraft que replica o jogo Clash Royale! Batalhe com cartas, tropas e estratégias no mundo do Minecraft.

## 🎮 Características

- **8 Tropas Diferentes**: Archer, Giant, Goblin, Knight, Prince, Wizard, Pekka e Minion
- **Sistema de Elixir**: Gerencie seu elixir para spawnar tropas
- **Torres Coroa**: Defenda suas torres e destrua as do inimigo
- **Arena de Batalha**: Sistema completo de arena para batalhas
- **Cartas**: Sistema de cartas colecionáveis
- **Comandos**: Comandos para controlar o jogo

## 📋 Requisitos

- Minecraft 1.19.2
- Minecraft Forge 43.2.0 ou superior
- Java 17 ou superior

## 🚀 Instalação

1. Instale o Minecraft Forge para a versão 1.19.2
2. Baixe o mod
3. Coloque o arquivo `.jar` na pasta `mods` do seu Minecraft
4. Inicie o jogo!

## 🎯 Como Jogar

### Comandos

- `/clashroyale start` - Inicia uma nova arena de batalha
- `/clashroyale spawn <tropa>` - Spawna uma tropa (archer, giant, goblin, knight, prince, wizard, pekka, minion)
- `/clashroyale elixir` - Mostra seu elixir atual
- `/clashroyale stop` - Encerra o jogo atual

### Itens

- **Cartas**: Use as cartas para spawnar tropas na arena
- **Elixir**: Item consumível que adiciona elixir
- **Bloco de Arena**: Coloque e interaja para abrir a GUI da arena
- **Torre Coroa**: Bloco que cria uma torre defensiva

## 🛠️ Desenvolvimento

### Build

```bash
./gradlew build
```

O arquivo `.jar` estará em `build/libs/`

### Executar no ambiente de desenvolvimento

```bash
./gradlew runClient
```

## 📦 Estrutura do Mod

```
src/main/java/com/clashroyale/
├── ClashRoyaleMod.java          # Classe principal
├── commands/                     # Comandos do jogo
├── entities/                     # Entidades (tropas e torres)
├── items/                        # Itens (cartas, elixir)
├── blocks/                       # Blocos (arena, torres)
├── game/                         # Lógica do jogo (arena, elixir)
├── client/gui/                   # Interfaces gráficas
├── init/                         # Registros (itens, blocos, entidades)
└── network/                      # Sistema de rede
```

## 🎨 Tropas Disponíveis

| Tropa | Custo de Elixir | Vida | Dano |
|-------|----------------|------|------|
| Goblin | 2 | 80 | 75 |
| Archer | 3 | 125 | 50 |
| Knight | 3 | 660 | 75 |
| Minion | 3 | 190 | 40 |
| Giant | 5 | 2000 | 150 |
| Prince | 5 | 1100 | 325 |
| Wizard | 5 | 340 | 130 |
| Pekka | 7 | 2600 | 600 |

## 📝 Licença

MIT License - Sinta-se livre para modificar e distribuir!

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se livre para abrir issues e pull requests.

---

**Divirta-se jogando Clash Royale no Minecraft!** 🎮⚔️

