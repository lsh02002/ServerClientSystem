public class ClientSystem {
    public static void main(String[] args){

        // 1. 유저 정보 입력 받습니다.
        Scanner reader = new Scanner(System.in);
        System.out.print("유저명을 입력하세요: ");
        String username = reader.next();
        System.out.print("권한을 입력하세요 (admin 또는 user): ");
        String role = reader.next();

        // 2. 서버에 연결
        try(Socket socket = new Socket("localhost", 1234)){ // 서버연결
            System.out.println("서버에 연결되었습니다.");

            // TODO: 서버로 데이터를 보내기 위한 ObjectOutputStream 생성

            // TODO: 서버로부터 데이터를 받기 위한 InputStream 생성

            // TODO: UserDTO 생성 및 전송

            // TODO 서버에 메시지 전송

            // TODO: 서버로부터 받은 응답 출력
            String response = null;

            System.out.println("서버의 응답: " + response);
            System.out.println("Client가 종료되었습니다.");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
