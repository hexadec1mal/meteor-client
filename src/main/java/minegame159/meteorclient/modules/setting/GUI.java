package minegame159.meteorclient.modules.setting;

import minegame159.meteorclient.modules.Category;
import minegame159.meteorclient.modules.Module;
import minegame159.meteorclient.settings.Setting;
import minegame159.meteorclient.settings.builders.ColorSettingBuilder;
import minegame159.meteorclient.utils.Color;

public class GUI extends Module {
    public static Color background = new Color();
    public static Color backgroundHighlighted = new Color();
    public static Color backgroundTextBox = new Color();

    public static Color separator = new Color();

    public static Color outline = new Color();
    public static Color outlineHighlighted = new Color();

    public static Color checkbox = new Color();

    public static Color text = new Color();
    public static int textC;



    private static Setting<Color> backgroundS;
    private static Setting<Color> backgroundHighlightedS;
    private static Setting<Color> backgroundTextBoxS;

    private static Setting<Color> separatorS;

    private static Setting<Color> outlineS;
    private static Setting<Color> outlineHighlightedS;

    private static Setting<Color> checkboxS;

    private static Setting<Color> textS;

    public GUI() {
        super(Category.Setting, "gui", "GUI settings.", true);

        backgroundS = addSetting(new ColorSettingBuilder()
                .name("background")
                .description("Background color.")
                .defaultValue(new Color(120, 120, 120))
                .consumer((color1, color2) -> background.set(color2))
                .build()
        );
        background.set(backgroundS.value());
        backgroundHighlightedS = addSetting(new ColorSettingBuilder()
                .name("background-highlighted")
                .description("Background highlighted color.")
                .defaultValue(new Color(145, 145, 145))
                .consumer((color1, color2) -> backgroundHighlighted.set(color2))
                .build()
        );
        backgroundHighlighted.set(backgroundHighlightedS.value());
        backgroundTextBoxS = addSetting(new ColorSettingBuilder()
                .name("background-text-box")
                .description("Background text box color.")
                .defaultValue(new Color(80, 80, 80))
                .consumer((color1, color2) -> backgroundTextBox.set(color2))
                .build()
        );
        backgroundTextBox.set(backgroundTextBoxS.value());

        separatorS = addSetting(new ColorSettingBuilder()
                .name("separator")
                .description("Separator color.")
                .defaultValue(new Color(135, 135, 135))
                .consumer((color1, color2) -> separator.set(color2))
                .build()
        );
        separator.set(separatorS.value());

        outlineS = addSetting(new ColorSettingBuilder()
                .name("outline")
                .description("Outline color.")
                .defaultValue(new Color(40, 40, 40))
                .consumer((color1, color2) -> outline.set(color2))
                .build()
        );
        outline.set(outlineS.value());
        outlineHighlightedS = addSetting(new ColorSettingBuilder()
                .name("outline-highlighted")
                .description("Outline highlighted color.")
                .defaultValue(new Color(125, 125, 125))
                .consumer((color1, color2) -> outlineHighlighted.set(color2))
                .build()
        );
        outlineHighlighted.set(outlineHighlightedS.value());

        checkboxS = addSetting(new ColorSettingBuilder()
                .name("checkbox")
                .description("Checkbox color.")
                .defaultValue(new Color(45, 225, 45))
                .consumer((color1, color2) -> checkbox.set(color2))
                .build()
        );
        checkbox.set(checkboxS.value());

        textS = addSetting(new ColorSettingBuilder()
                .name("text")
                .description("Text color.")
                .defaultValue(new Color(255, 255, 255))
                .consumer((color1, color2) -> {
                    text.set(color2);
                    textC = color2.getPacked();
                })
                .build()
        );
        text.set(textS.value());
        textC = text.getPacked();
    }
}
