package ru.otus.sam127.basic.lesson20HW.server;

import java.io.*;

public class PingServer implements AutoCloseable {
    private DataInputStream in;
    private DataOutputStream out;

    public PingServer(InputStream in, OutputStream out) {
        this.in = new DataInputStream(new BufferedInputStream(in));
        this.out = new DataOutputStream(new BufferedOutputStream(out));
    }

    public void write(byte[] bytes) throws IOException {
        out.write(bytes);
        out.flush();
    }
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return reader.readLine();
    }
    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }
}
