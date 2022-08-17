package br.cesupa.compiladores.compilador.alguma.lexico.antlr;

import br.cesupa.compiladores.alguma.lexico.antlr.AlgumaLexer;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {
    
    public static void main(String[] args) {
        try {
            CharStream cs = CharStreams.fromFileName("C:\\Users\\20070022\\Documents\\NetBeansProjects\\alguma-lexico-antlr\\src\\main\\java\\br\\cesupa\\compiladores\\compilador\\alguma\\lexico\\antlr\\programa.alguma");
            AlgumaLexer lex = new AlgumaLexer(cs);
            Token t = null;
             while ((t = lex.nextToken()).getType() != Token.EOF) {
                 // System.out.println("<"+t.getType() + "," + t.getText()+">");
                 System.out.println("<" + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + ", " + t.getText() + ">");
             }
             
        } catch (IOException ex) {
        }
    }
    
}
