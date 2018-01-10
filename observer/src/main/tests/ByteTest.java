/**
 */
public class ByteTest {

    public static void main(String[] args) {
        int x = 8143;
        byte[] bytes = int2ByteArray(x);
        for (byte b : bytes) {
            System.out.println(b);
        }

        Integer integer = byteArray2Int(bytes);
        System.out.println(integer);
    }

    static byte[] int2ByteArray(Integer x) {
        byte[] bytes = new byte[4];//4个字节
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (x >> i * 8 & 0xff);
        }
        return bytes;
    }

    static Integer byteArray2Int(byte[] bytes) {
        Integer x = 0;
        for (int i = 0; i < bytes.length; i++) {
            x += (bytes[i] & 0xff) << i * 8;
        }
        return x;
    }

}
