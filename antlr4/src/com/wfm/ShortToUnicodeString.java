package com.wfm;

/**
 * @version 1.0
 * @ClassName ShortToUnicodeString
 * @Descripyion TODO
 * @date 2020/5/30 23:44
 */
public class ShortToUnicodeString extends  ArrayInitBaseListener{

    /**
     * �� { ����Ϊ ��
     * @param ctx
     */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.println('"');
    }

    /**
     * �� } ����Ϊ ��
     * @param ctx
     */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.println('"');
    }


    /**
     * ��������������Ϊʮ��������ʽ��Ȼ���ǰ׺ "u"
     * @param ctx
     */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        //�ٶ�������Ƕ�׽ṹ
        Integer value = Integer.valueOf(ctx.INT().getText());
        System.out.printf("\\u%04x",value);
    }
}
