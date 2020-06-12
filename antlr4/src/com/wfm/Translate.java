package com.wfm;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * @author wangfanming
 * @version 1.0
 * @ClassName Translate
 * @Descripyion TODO
 * @date 2020/5/30 23:51
 */
public class Translate {
    public static void main(String[] args) throws IOException {
        //�½�һ��CharStream,�ӱ�׼�����ȡ����
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        //�½�һ���ʷ������������������CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        //�½�һ���ʷ����ŵĻ����������ڴ洢�ʷ����������ɵĴʷ�����
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //�½�һ���﷨������������ʷ����Ż������е�����
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init(); //���init���򣬽����﷨����

        //�½�һ��ͨ�õġ��ܹ������ص��������﷨������������
        ParseTreeWalker walker = new ParseTreeWalker();

        //�����﷨�������������ɵ��﷨�������������ص�
        walker.walk(new ShortToUnicodeString(),tree);

        System.out.println();

        // System.out.println(tree.toStringTree(parser));  //��LISP����ӡ���ɵ���

    }
}
