package Controller;

import Model.RainbowModel;
import Model.RainbowBuilder;
import View.RainbowPanel;

import java.awt.Color;
import java.util.List;

public class RainbowController {
    private final RainbowModel model;
    private final RainbowPanel view;

    public RainbowController(RainbowModel model, RainbowPanel view) {
        this.model = model;
        this.view = view;
    }

    public void setFirstColor(Color color) {
        model.setFirstColor(color);
    }

    public void setSecondColor(Color color) {
        model.setSecondColor(color);
    }

    public void generateRainbow() {
        RainbowBuilder builder = new RainbowBuilder()
                .setStartColor(model.getFirstColor())
                .setEndColor(model.getSecondColor());
        List<Color> rainbow = builder.build();
        view.displayRainbow(rainbow);
    }
}
