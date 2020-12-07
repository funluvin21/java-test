public class test {
  public static int byte2Int(byte[] src) {
    int s1 = src[0] & 0xFF;
    int s2 = src[1] & 0xFF;
    int s3 = src[2] & 0xFF;
    int s4 = src[3] & 0xFF;
    
    return ((s1 << 24) + (s2 << 16) + (s3 << 8) + (s4 << 0));
  }
  //출처: https://it77.tistory.com/47 [시원한물냉의 사람사는 이야기]

}
