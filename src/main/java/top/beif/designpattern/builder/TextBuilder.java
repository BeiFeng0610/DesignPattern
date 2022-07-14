package top.beif.designpattern.builder;

/**
 * @author 16116
 */
public class TextBuilder extends Builder {
    private StringBuilder builder = new StringBuilder();


    @Override
    protected void bulidTitle(String title) {
        builder.append("===============================================\n");
        builder.append("「").append(title).append("」\n");
        builder.append("\n");
    }

    @Override
    protected void bulidString(String str) {
        builder.append("■").append(str).append("\n");
    }

    @Override
    protected void bulidItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            builder.append(" ·").append(items[i]).append("\n");
        }
        builder.append("\n");
    }

    @Override
    protected void buildDone() {
        builder.append("===============================================\n");
    }

    public String getResult(){
        return builder.toString();
    }
}
