// Generated from /home/davigomes/Downloads/COMPILADORES/qproject-antlr/src/main/java/br/ufc/qproject/antlr4/qproject.g4 by ANTLR 4.7.2
package br.ufc.qproject.frontend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link qprojectParser}.
 */
public interface qprojectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link qprojectParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(qprojectParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(qprojectParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_de_definicoes}.
	 * @param ctx the parse tree
	 */
	void enterLista_de_definicoes(qprojectParser.Lista_de_definicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_de_definicoes}.
	 * @param ctx the parse tree
	 */
	void exitLista_de_definicoes(qprojectParser.Lista_de_definicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#definicao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao(qprojectParser.DefinicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#definicao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao(qprojectParser.DefinicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(qprojectParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(qprojectParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_estrutura_corpo}.
	 * @param ctx the parse tree
	 */
	void enterLista_estrutura_corpo(qprojectParser.Lista_estrutura_corpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_estrutura_corpo}.
	 * @param ctx the parse tree
	 */
	void exitLista_estrutura_corpo(qprojectParser.Lista_estrutura_corpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura_acesso(qprojectParser.Estrutura_acessoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura_acesso(qprojectParser.Estrutura_acessoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_estrutura_membros}.
	 * @param ctx the parse tree
	 */
	void enterLista_estrutura_membros(qprojectParser.Lista_estrutura_membrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_estrutura_membros}.
	 * @param ctx the parse tree
	 */
	void exitLista_estrutura_membros(qprojectParser.Lista_estrutura_membrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#membro}.
	 * @param ctx the parse tree
	 */
	void enterMembro(qprojectParser.MembroContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#membro}.
	 * @param ctx the parse tree
	 */
	void exitMembro(qprojectParser.MembroContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#construtor}.
	 * @param ctx the parse tree
	 */
	void enterConstrutor(qprojectParser.ConstrutorContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#construtor}.
	 * @param ctx the parse tree
	 */
	void exitConstrutor(qprojectParser.ConstrutorContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(qprojectParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(qprojectParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(qprojectParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(qprojectParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#variavel_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterVariavel_atribuicao(qprojectParser.Variavel_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#variavel_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitVariavel_atribuicao(qprojectParser.Variavel_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(qprojectParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(qprojectParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#funcao_cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_cabecalho(qprojectParser.Funcao_cabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#funcao_cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_cabecalho(qprojectParser.Funcao_cabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#parametros_formais}.
	 * @param ctx the parse tree
	 */
	void enterParametros_formais(qprojectParser.Parametros_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#parametros_formais}.
	 * @param ctx the parse tree
	 */
	void exitParametros_formais(qprojectParser.Parametros_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_parametros_formais}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros_formais(qprojectParser.Lista_parametros_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_parametros_formais}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros_formais(qprojectParser.Lista_parametros_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(qprojectParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(qprojectParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#tipo_nome}.
	 * @param ctx the parse tree
	 */
	void enterTipo_nome(qprojectParser.Tipo_nomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#tipo_nome}.
	 * @param ctx the parse tree
	 */
	void exitTipo_nome(qprojectParser.Tipo_nomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#qualificador}.
	 * @param ctx the parse tree
	 */
	void enterQualificador(qprojectParser.QualificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#qualificador}.
	 * @param ctx the parse tree
	 */
	void exitQualificador(qprojectParser.QualificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#decorador}.
	 * @param ctx the parse tree
	 */
	void enterDecorador(qprojectParser.DecoradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#decorador}.
	 * @param ctx the parse tree
	 */
	void exitDecorador(qprojectParser.DecoradorContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(qprojectParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(qprojectParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_comandos}.
	 * @param ctx the parse tree
	 */
	void enterLista_comandos(qprojectParser.Lista_comandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_comandos}.
	 * @param ctx the parse tree
	 */
	void exitLista_comandos(qprojectParser.Lista_comandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(qprojectParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(qprojectParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(qprojectParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(qprojectParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#selecao_senao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao_senao(qprojectParser.Selecao_senaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#selecao_senao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao_senao(qprojectParser.Selecao_senaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(qprojectParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(qprojectParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(qprojectParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(qprojectParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(qprojectParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(qprojectParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(qprojectParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(qprojectParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_entrada_params}.
	 * @param ctx the parse tree
	 */
	void enterLista_entrada_params(qprojectParser.Lista_entrada_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_entrada_params}.
	 * @param ctx the parse tree
	 */
	void exitLista_entrada_params(qprojectParser.Lista_entrada_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(qprojectParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(qprojectParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_saida_params}.
	 * @param ctx the parse tree
	 */
	void enterLista_saida_params(qprojectParser.Lista_saida_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_saida_params}.
	 * @param ctx the parse tree
	 */
	void exitLista_saida_params(qprojectParser.Lista_saida_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterLista_declaracoes_locais(qprojectParser.Lista_declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitLista_declaracoes_locais(qprojectParser.Lista_declaracoes_locaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#expressao_comando}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_comando(qprojectParser.Expressao_comandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#expressao_comando}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_comando(qprojectParser.Expressao_comandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionFalse}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionFalse(qprojectParser.ExpressionFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionFalse}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionFalse(qprojectParser.ExpressionFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOperatorBinary}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperatorBinary(qprojectParser.ExpressionOperatorBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOperatorBinary}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperatorBinary(qprojectParser.ExpressionOperatorBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionParameter}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParameter(qprojectParser.ExpressionParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionParameter}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParameter(qprojectParser.ExpressionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionTrue}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionTrue(qprojectParser.ExpressionTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionTrue}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionTrue(qprojectParser.ExpressionTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionOperatorUnary}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOperatorUnary(qprojectParser.ExpressionOperatorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionOperatorUnary}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOperatorUnary(qprojectParser.ExpressionOperatorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressinParen}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressinParen(qprojectParser.ExpressinParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressinParen}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressinParen(qprojectParser.ExpressinParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionNome}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNome(qprojectParser.ExpressionNomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionNome}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNome(qprojectParser.ExpressionNomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionCharl}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCharl(qprojectParser.ExpressionCharlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionCharl}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCharl(qprojectParser.ExpressionCharlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionInt}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInt(qprojectParser.ExpressionIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionInt}
	 * labeled alternative in {@link qprojectParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInt(qprojectParser.ExpressionIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_binario(qprojectParser.Operador_binarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_binario(qprojectParser.Operador_binarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#operador_unario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_unario(qprojectParser.Operador_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#operador_unario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_unario(qprojectParser.Operador_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(qprojectParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(qprojectParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#nome_lista}.
	 * @param ctx the parse tree
	 */
	void enterNome_lista(qprojectParser.Nome_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#nome_lista}.
	 * @param ctx the parse tree
	 */
	void exitNome_lista(qprojectParser.Nome_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#nome_one}.
	 * @param ctx the parse tree
	 */
	void enterNome_one(qprojectParser.Nome_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#nome_one}.
	 * @param ctx the parse tree
	 */
	void exitNome_one(qprojectParser.Nome_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#parametros_reais}.
	 * @param ctx the parse tree
	 */
	void enterParametros_reais(qprojectParser.Parametros_reaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#parametros_reais}.
	 * @param ctx the parse tree
	 */
	void exitParametros_reais(qprojectParser.Parametros_reaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link qprojectParser#lista_parametros_reais}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros_reais(qprojectParser.Lista_parametros_reaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link qprojectParser#lista_parametros_reais}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros_reais(qprojectParser.Lista_parametros_reaisContext ctx);
}