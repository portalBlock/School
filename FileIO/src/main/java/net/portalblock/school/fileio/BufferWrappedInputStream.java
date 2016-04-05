package net.portalblock.school.fileio;

import java.io.InputStream;

/**
 * Created by portalBlock on 4/4/2016.
 */
public interface BufferWrappedInputStream<T> {

    public T value();

    public T use();

    public interface Reader<T> {

        public T readNext(InputStream is);

    }

}
