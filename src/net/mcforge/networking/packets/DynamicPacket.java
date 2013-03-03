package net.mcforge.networking.packets;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import net.mcforge.networking.IOClient;
import net.mcforge.server.Server;

public abstract class DynamicPacket extends Packet {

    public DynamicPacket(String name, byte ID, PacketManager parent) {
        super(name, ID, parent);
    }

    public abstract void handle(Server server, IOClient player, InputStream reader);
    
    public abstract void write(Server server, IOClient player, OutputStream writer, Object... obj);
    

    @Override
    public void Handle(byte[] message, Server server, IOClient player) {
        throw new InvalidPacketCall("This is a dynamic packet, you can not provide it a byte-array.");
    }

    @Override
    public void Write(IOClient client, Server servers) {
        write(servers, client, client.getOutputStream());
    }
    
    @Override
    public void Write(IOClient client, Server server, Object... obj) {
        write(server, client, client.getOutputStream(), obj);
    }
    
    @Override
    public boolean dynamicSize() {
        return true;
    }
    
    /**
     * Read a string from the {@link DataInputStream} object.
     * @param input
     *             The input to read from
     * @return
     *        A string
     * @throws IOException
     */
    public String readString(DataInputStream input) throws IOException {
        short len = input.readShort();
        byte[] array = new byte[len * 2];
        input.read(array, 0, len * 2);
        String toreturn = new String(array, 0, len * 2, "UTF-16BE");
        return toreturn;
    }
}
