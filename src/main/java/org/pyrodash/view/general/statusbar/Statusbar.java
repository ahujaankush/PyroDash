package org.pyrodash.view.general.statusbar;

import javax.swing.*;
import java.awt.*;

public class Statusbar extends JPanel {
    private JComponent[] leftComponents, centeredComponents, rightComponents, topComponents, bottomComponents;
    private JPanel leftContainer, centeredContainer, rightContainer, topContainer, bottomContainer;

    public Statusbar(JComponent[] leftComponents, JComponent[] centeredComponents, JComponent[] rightComponents, JComponent[] topComponents, JComponent[] bottomComponents) {
        // Init Components
        this.leftComponents = leftComponents;
        this.centeredComponents = centeredComponents;
        this.rightComponents = rightComponents;
        this.topComponents = topComponents;
        this.bottomComponents = bottomComponents;

        // Init Containers
        leftContainer = new JPanel();
        centeredContainer = new JPanel();
        rightContainer = new JPanel();
        topContainer = new JPanel();
        bottomContainer = new JPanel();

        // add the components
        addComponents();

        // setup the panels and the statusbar
        this.setLayout(new BorderLayout());
    }

    private void addComponents() {
        // add left components
        for(JComponent component : leftComponents) {
            leftContainer.add(component, BorderLayout.WEST);
        }
        // add center components
        for(JComponent component : centeredComponents) {
            centeredContainer.add(component, BorderLayout.CENTER);
        }
        // add right components
        for(JComponent component : rightComponents) {
            rightContainer.add(component, BorderLayout.EAST);
        }
        // add top components
        for(JComponent component : topComponents) {
            topContainer.add(component, BorderLayout.NORTH);
        }
        // add bottom components
        for(JComponent component : bottomComponents) {
            bottomContainer.add(component, BorderLayout.SOUTH);
        }
    }
}
