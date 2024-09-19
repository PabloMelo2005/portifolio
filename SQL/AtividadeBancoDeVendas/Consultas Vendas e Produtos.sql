[ Consultas para a tabela de Notas Fiscais ]

Consulta do valor total em processamento na tabela das notas fiscais:

SELECT STATUS AS 'Status da NF', sum(valor_total) AS 'Valor total em processamento'
FROM notas_fiscais
WHERE STATUS = 'Processando';

Consulta do valor total de vendas dentro do estado:

SELECT natureza_da_operacao, sum(valor_total) AS 'Valor total de vendas dentro do estado(R$)'
FROM notas_fiscais
WHERE natureza_da_operacao = 'venda dentro do estado';


[ Consultas para a tabela de Produtos ]

Verificar quantas mercadorias são para revenda:

SELECT COUNT(codigo_de_barras) AS 'qtde_revenda', tipo
FROM produtos
WHERE tipo = 'Mercadoria para Revenda';