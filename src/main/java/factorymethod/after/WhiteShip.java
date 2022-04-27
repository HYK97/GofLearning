package factorymethod.after;

import abstract_factory.before.WhiteAnchor;
import abstract_factory.before.WhiteWheel;
import lombok.Data;

@Data
public class WhiteShip extends Ship{

    private WhiteAnchor whiteAnchor;

    private WhiteWheel whiteWheel;

    public WhiteShip() {
        setName("whiteship");
        setLogo("\uD83D\uDEE5");
        setColor("white");
    }
}
