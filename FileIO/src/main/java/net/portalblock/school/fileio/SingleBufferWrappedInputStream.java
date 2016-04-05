package net.portalblock.school.fileio;

import java.io.InputStream;

/**
 * Created by portalBlock on 4/4/2016.
 */
public class SingleBufferWrappedInputStream<T> implements BufferWrappedInputStream<T> {

    private T value;
    private Reader<T> reader;
    private InputStream inputStream;

    public SingleBufferWrappedInputStream(Reader<T> reader, InputStream inputStream) {
        this.reader = reader;
        this.inputStream = inputStream;
    }

    @Override
    public T value() {
        return this.value;
    }

    @Override
    public T use() {
        T result = this.value;
        if(this.reader != null && this.inputStream != null)
            this.value = reader.readNext(this.inputStream);
        return result;
    }

}
