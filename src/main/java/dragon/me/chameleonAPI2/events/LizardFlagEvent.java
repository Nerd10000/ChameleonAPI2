package dragon.me.chameleonAPI2.events;

import dragon.me.chameleonAPI2.enums.CHECKS;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LizardFlagEvent extends Event {

    private static  final HandlerList HANDLER_LIST = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public LizardFlagEvent(CHECKS check, Player player,char type,String debugInformation){

    }
}
