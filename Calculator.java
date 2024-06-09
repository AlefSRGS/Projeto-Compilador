import java.util.HashMap;
class Calculator extends gramaticaBaseVisitor<Double> {
    private HashMap<String, Double> symbolTable = new HashMap<>();
    public HashMap<String, Double> getSymbolTable(){
        return symbolTable;
    }
    @Override
    public Double visitProgram(gramaticaParser.ProgramContext ctx) {
        Double result = 0.0;
        for (gramaticaParser.StatementContext statement : ctx.statement()) {
            result = visit(statement);
        }
        return result;
    }

    @Override
    public Double visitVariableDeclaration(gramaticaParser.VariableDeclarationContext ctx) {
        String varName = ctx.ID().getText();
        Double value = visit(ctx.expression());
        symbolTable.put(varName, value);
        return value;
    }

    @Override
    public Double visitExpression(gramaticaParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.term(0));
        } else {
            Double leftValue = visit(ctx.term(0));
            Double rightValue = visit(ctx.term(1));
            String operator = ctx.getChild(1).getText();
            switch (operator) {
                case "+":
                    return leftValue + rightValue;
                case "-":
                    return leftValue - rightValue;
                case "*":
                    return leftValue * rightValue;
                case "/":
                    return leftValue / rightValue;
                case "%":
                    return leftValue % rightValue;
                default:
                    throw new IllegalArgumentException("Operador inválido: " + operator);
            }
        }
    }
}