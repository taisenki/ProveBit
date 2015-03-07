package org.provebit.daemon;

import java.io.File;
import java.io.IOException;

import org.provebit.merkle.Merkle;

public class DaemonDemo {
	// Change to some path on your local computer
    private static File liveDir = new File("/home/dan/school/cs429/liveDemos");
	public static void main(String[] args) throws InterruptedException, IOException {
		Merkle m = new Merkle();
    	m.addTracking(liveDir, false);
		MerkleDaemon daemon = new MerkleDaemon(m, 100);
		daemon.start();
		Thread.sleep(2000);
		new DaemonDemoReconnect().start();
		System.out.println("Main closing...");
	}
}
