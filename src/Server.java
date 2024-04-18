import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static void main(String[] args) {

        // 유저 대기리스트
        List<User> userList = new ArrayList<>();

        // 1. 서버 소켓 생성
        try(ServerSocket serverSocket = new ServerSocket(1234)){
            System.out.println("서버가 시작되었습니다.");

            while(true) {
                // TODO: 유저 Server 연결 필요합니다.
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("클라이언트가 연결되었습니다.");

                    ObjectInputStream clientInputStream = new ObjectInputStream(clientSocket.getInputStream());

                        UserDTO userDTO = (UserDTO) clientInputStream.readObject();
                        User user = new User(userDTO.getUsername(), userDTO.getRole());

                        userList.add(user);

                        System.out.println("새로운 유저가 등록되었습니다. " + userList);

                    } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }catch(EOFException e){
                    System.out.println("");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
