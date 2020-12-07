public class test {
  
  //출처: https://it77.tistory.com/47 [시원한물냉의 사람사는 이야기]
  //byte배열(물론 사이즈는 4)을 int로 바꾸는 메소드
  public static int byte2Int(byte[] src) {
    int s1 = src[0] & 0xFF;
    int s2 = src[1] & 0xFF;
    int s3 = src[2] & 0xFF;
    int s4 = src[3] & 0xFF;
    
    return ((s1 << 24) + (s2 << 16) + (s3 << 8) + (s4 << 0));
  }
  
  //long을 byte배열(물론 사이즈는 8)로 바꾸는 메소드
  public static byte[] long2Bytes(long l) {
        byte[] buf = new byte[8];
        buf[0] = (byte)( (l >>> 56) & 0xFF );
        buf[1] = (byte)( (l >>> 48) & 0xFF );
        buf[2] = (byte)( (l >>> 40) & 0xFF );
        buf[3] = (byte)( (l >>> 32) & 0xFF );   
        buf[4] = (byte)( (l >>> 24) & 0xFF );
        buf[5] = (byte)( (l >>> 16) & 0xFF );
        buf[6] = (byte)( (l >>>  8) & 0xFF );
        buf[7] = (byte)( (l >>>  0) & 0xFF );
    
        return buf;
  }
  
  //byte배열(물론 사이즈는 4)을 int로 바꾸는 다른 방법
  public static int byte2Int_2(byte[] src) {
    byte[] intToByte = new byte[4];   
    int a = 132;   
    System.out.println("int를 byte 배열로 바꾼다.");   
    intToByte[0] |= (byte)((a&0xFF000000)>>24);   
    intToByte[1] |= (byte)((a&0xFF0000)>>16);   
    intToByte[2] |= (byte)((a&0xFF00)>>8);   
    intToByte[3] |= (byte)(a&0xFF);   
  
    System.out.println("byte 배열을 int로 바꾼다");   
    int result = 0;   
    result |= (intToByte[0] & (int)0xFF)<<24;   
    result |= (intToByte[1] & (int)0xFF)<<16;   
    result |= (intToByte[2] & (int)0xFF)<<8;   
    result |= (intToByte[3] & (int)0xFF);   
    System.out.println("byte To Int is "+ result );
  }

}
