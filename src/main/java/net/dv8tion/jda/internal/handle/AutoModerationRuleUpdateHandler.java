package net.dv8tion.jda.internal.handle;

import net.dv8tion.jda.api.utils.data.DataObject;
import net.dv8tion.jda.internal.JDAImpl;

public class AutoModerationRuleUpdateHandler extends SocketHandler {

    public AutoModerationRuleUpdateHandler(JDAImpl api) {
        super(api);
    }

    @Override
    protected Long handleInternally(DataObject content) {
        return null;
    }
}
