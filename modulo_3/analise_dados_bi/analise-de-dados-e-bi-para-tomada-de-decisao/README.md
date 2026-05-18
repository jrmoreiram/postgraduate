# 📊 Análise de Dados e BI para Tomada de Decisão

Repositório de análise de dados e Business Intelligence do Módulo 3 - Pós-Graduação em Engenharia de Software. Contém dashboards interativos, datasets e visualizações para suportar a tomada de decisão estratégica.

## 📁 Estrutura do Projeto

### Dashboards Power BI (.pbix)
| Arquivo | Descrição |
|---------|-----------|
| **Chamados.pbix** | Dashboard de análise de chamados/tickets - volume, SLA, distribuição por tipo |
| **Colaboradores.pbix** | Dashboard de RH - análise de colaboradores, produtividade e performance |
| **Consultores.pbix** | Dashboard de consultores - carteira de clientes, faturamento, horas alocadas |
| **Distribuidora_Descomplica.pbix** | Dashboard comercial - análise de produtos, vendas e distribuição |

### Dados Brutos (Excel)
| Arquivo | Descrição | Linhas |
|---------|-----------|--------|
| **Chamados.xlsx** | Base de dados de chamados/tickets | ~800 registros |
| **Colaboradores.xlsx** | Cadastro de colaboradores ativos | ~400 registros |
| **Colaboradores1_.xlsx** | Dados complementares de colaboradores | ~150 registros |
| **Consultores.xlsx** | Base de consultores e suas alocações | ~600 registros |
| **Consultores_Partes2.xlsx** | Dados complementares - parte 2 | ~350 registros |
| **Consultores_Partes3.xlsx** | Dados complementares - parte 3 | ~300 registros |
| **Distribuidora_Produtos.xlsx** | Catálogo e histórico de produtos | ~500 registros |
| **Processos_Parte1.xlsx** | Base de processos - parte 1 | ~2.000 registros |
| **Processos_Parte2.xlsx** | Base de processos - parte 2 | ~4.000 registros |

### Visualizações (SVG)
| Arquivo | Descrição |
|---------|-----------|
| **Analises_Gerais.SVG** | Visualização gráfica de análises gerais |
| **PainelAzul.SVG** | Design template de painel executivo |
| **consultor.SVG** | Ícone/avatar de consultor |

## 🎯 Casos de Uso

### 1. Gestão de Chamados
- Monitorar SLA e tempo de resolução
- Análise de volume por departamento/tipo
- Identificação de gargalos

### 2. Análise de Recursos Humanos
- Acompanhamento de colaboradores
- Indicadores de produtividade
- Alocação de recursos

### 3. Gestão de Consultores
- Carteira de clientes por consultor
- Análise de faturamento e margens
- Horas alocadas vs. faturado

### 4. Operações de Distribuição
- Análise de vendas de produtos
- Distribuição por regiões/canais
- Performance de vendedores

### 5. Gestão de Processos
- Acompanhamento de fluxos operacionais
- Identificação de processos críticos
- Métricas de eficiência

## 🚀 Como Usar

### Abrir Dashboards Power BI
1. Instale o Microsoft Power BI Desktop
2. Abra os arquivos `.pbix` em Power BI Desktop
3. Os dados serão carregados automaticamente das conexões configuradas
4. Interaja com os filtros para explorar os dados

### Explorar Dados Brutos
1. Use Excel, LibreOffice Calc ou similares para abrir arquivos `.xlsx`
2. Cada aba contém dimensões e medidas estruturadas
3. Use como fonte para novas análises ou validações

### Integrar Dados
- Combine as bases de dados conforme necessário
- Use Consultores_Partes2 e 3 como complemento aos dados principais
- Processos_Parte1 e 2 devem ser consolidados para análise completa

## 📊 Principais Métricas Disponíveis

- **Volumes**: Chamados processados, colaboradores ativos, consultores, produtos
- **Financeiro**: Faturamento, margens, custo operacional
- **Operacional**: SLA, tempo médio de resolução, eficiência de processos
- **RH**: Produtividade, taxa de ocupação, indicadores de performance

## 🔧 Requisitos

- **Power BI Desktop** (para visualizar dashboards .pbix)
- **Microsoft Excel** ou LibreOffice Calc (para dados em .xlsx)
- **Navegador web** (para publicar e compartilhar em Power BI Service - opcional)

## 📝 Notas Importantes

- Os dashboards estão conectados aos arquivos Excel neste diretório
- Para atualizar os dados, modifique os arquivos Excel e recarregue em Power BI
- As bases de Consultores e Processos estão divididas - consolidar antes de análise final
- Verificar integridade referencial entre as tabelas antes de publicar

## 👥 Contato & Suporte

Desenvolvido como parte do Módulo 3 - Analytics & Business Intelligence - Pós-Graduação em Engenharia de Software.  

---

**Última atualização**: Maio 2026  
**Status**: ✅ Completo e funcional  