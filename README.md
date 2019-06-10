# Análise Semântica
## Observações
1. Por conta da forma como o analisador está configurado para receber o fonte (ver linha que cria o `Lexer`), você precisa
   se lembrar de teclar `Ctrl+D` após o último `Enter`. Isso irá enviar um caractere de fim-de-entrada ao lexer, que irá
   encerrar a espera pela entrada e iniciar o processo de análise.
1. Veja no _wiki_ do projeto "QALC" como importar este projeto no IntelliJ.
1. Não se esqueça de configurar a gramática com as informações abaixo antes de prosseguir (O IntelliJ não exporta essa 
   configuração).
  * Output directory (...): `/home/araruna/workspace/java/comp-material/comp-semantica/src/main/java`
  * Package/namespace (...): `br.ufc.quixada.qxd0025.semantica.frontend`
  * Language (...): `Java`
  * Generate parse tree listener: **marcar**