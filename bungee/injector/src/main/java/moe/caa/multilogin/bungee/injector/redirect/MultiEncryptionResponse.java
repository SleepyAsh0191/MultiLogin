package moe.caa.multilogin.bungee.injector.redirect;

import net.md_5.bungee.protocol.AbstractPacketHandler;
import net.md_5.bungee.protocol.packet.EncryptionResponse;

public class MultiEncryptionResponse extends EncryptionResponse {

    @Override
    public void handle(AbstractPacketHandler handler) throws Exception {
        System.out.println(handler);
        super.handle(handler);
    }
}
