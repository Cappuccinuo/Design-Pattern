package Builder;

public class Demo {
    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "World"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words) {
            sb.append(String.format("  <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);

        HTMLBuilder builder = new HTMLBuilder("ul");
        builder.addChild("li", "Hello");
        builder.addChild("li", "World");
        System.out.println(builder);

        HTMLBuilder builder2 = new HTMLBuilder("ul");
        builder2.addChildFluent("li", "Hello").addChildFluent("li", "World");
        System.out.println(builder2);
    }
}
