/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.dubbo.common.serialize.support.fst;

import java.io.IOException;
import java.io.OutputStream;

import org.nustaq.serialization.FSTObjectOutput;

import com.alibaba.dubbo.common.serialize.ObjectOutput;

/**
 * FstObjectOutput
 * Description:
 *
 * @auther <a href="mailto:kitdnie@gmail.com">JobSHen</a>
 * @date 2017/7/17 14:51
 * @sinece 3.0.0
 */
public class FstObjectOutput implements ObjectOutput {

    private FSTObjectOutput output;

    public FstObjectOutput(OutputStream outputStream) {
        output = FstFactory.getDefaultFactory().getObjectOutput(outputStream);
    }

    public void writeBool(boolean v) throws IOException {
        output.writeBoolean(v);
    }

    public void writeByte(byte v) throws IOException {
        output.writeByte(v);
    }

    public void writeShort(short v) throws IOException {
        output.writeShort(v);
    }

    public void writeInt(int v) throws IOException {
        output.writeInt(v);
    }

    public void writeLong(long v) throws IOException {
        output.writeLong(v);
    }

    public void writeFloat(float v) throws IOException {
        output.writeFloat(v);
    }

    public void writeDouble(double v) throws IOException {
        output.writeDouble(v);
    }

    public void writeBytes(byte[] v) throws IOException {
        if (v == null) {
            output.writeInt(-1);
        } else {
            writeBytes(v, 0, v.length);
        }
    }

    public void writeBytes(byte[] v, int off, int len) throws IOException {
        if (v == null) {
            output.writeInt(-1);
        } else {
            output.writeInt(len);
            output.write(v, off, len);
        }
    }


    public void writeUTF(String v) throws IOException {
        output.writeUTF(v);
    }

    public void writeObject(Object v) throws IOException {
        output.writeObject(v);
    }

    public void flushBuffer() throws IOException {
        output.flush();
    }
}
