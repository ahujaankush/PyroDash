package org.pyrodash.view.theme;

import java.awt.*;

/**
 * Themes are a collection of colors which are used to style the application.
 * Themes consist of 16 colors (.Xresources).
 * @author Ankush Ahuja
 * @version 060123
 */
public abstract class Theme {
    // special
    private final Color background;
    private final Color foreground;
    // black
    private final Color color0;
    private final Color color8;
    // red
    private final Color color1;
    private final Color color9;
    // green
    private final Color color2;
    private final Color color10;
    // yellow
    private final Color color3;
    private final Color color11;
    // blue
    private final Color color4;
    private final Color color12;
    // magenta
    private final Color color5;
    private final Color color13;
    // cyan
    private final Color color6;
    private final Color color14;
    // white
    private final Color color7;
    private final Color color15;

    /**
     * Creates new theme using colors
     * @param fg foreground
     * @param bg background
     * @param c0 black1
     * @param c1 red1
     * @param c2 green1
     * @param c3 yellow1
     * @param c4 blue1
     * @param c5 magenta1
     * @param c6 cyan1
     * @param c7 white1
     * @param c8 black2
     * @param c9 red2
     * @param c10 green2
     * @param c11 yellow2
     * @param c12 blue2
     * @param c13 magenta2
     * @param c14 cyan2
     * @param c15 white2
     */
    public Theme(Color fg, Color bg, Color c0, Color c1, Color c2, Color c3, Color c4,
                 Color c5, Color c6, Color c7, Color c8, Color c9, Color c10, Color c11,
                 Color c12, Color c13, Color c14, Color c15) {
        // Init colors
        this.foreground = fg;
        this.background = bg;
        this.color0 = c0;
        this.color1 = c1;
        this.color2 = c2;
        this.color3 = c3;
        this.color4 = c4;
        this.color5 = c5;
        this.color6 = c6;
        this.color7 = c7;
        this.color8 = c8;
        this.color9 = c9;
        this.color10 = c10;
        this.color11 = c11;
        this.color12 = c12;
        this.color13 = c13;
        this.color14 = c14;
        this.color15 = c15;
    }

    public Color getBackground() {
        return background;
    }

    public Color getForeground() {
        return foreground;
    }

    public Color getColor0() {
        return color0;
    }

    public Color getColor8() {
        return color8;
    }

    public Color getColor1() {
        return color1;
    }

    public Color getColor9() {
        return color9;
    }

    public Color getColor2() {
        return color2;
    }

    public Color getColor10() {
        return color10;
    }

    public Color getColor3() {
        return color3;
    }

    public Color getColor11() {
        return color11;
    }

    public Color getColor4() {
        return color4;
    }

    public Color getColor12() {
        return color12;
    }

    public Color getColor5() {
        return color5;
    }

    public Color getColor13() {
        return color13;
    }

    public Color getColor6() {
        return color6;
    }

    public Color getColor14() {
        return color14;
    }

    public Color getColor7() {
        return color7;
    }

    public Color getColor15() {
        return color15;
    }
}
