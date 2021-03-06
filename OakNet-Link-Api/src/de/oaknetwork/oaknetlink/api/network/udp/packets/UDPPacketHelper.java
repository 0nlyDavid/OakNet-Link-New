package de.oaknetwork.oaknetlink.api.network.udp.packets;

/**
 * This class provides some Utilities regarding UDPPackets
 * 
 * @author Fabian Fila
 */
public class UDPPacketHelper {

	public static void registerPackets() {
		new UDPPingPacket();
		new UDPPongPacket();
		new UDPDisconnectionPacket();
	}

}
