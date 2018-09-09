import java.io.*;

public class CmdTest2 {
    public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "cd \"C:\\Users\\prism\\youtube-dl\" && C: && REM youtube-dl.exe -a test.txt && aria2c -c \"https://dl.google.com/dl/android/studio/ide-zips/2.4.0.1/android-studio-ide-171.3804685-windows.zip\" && aria2c --enable-rpc --rpc-listen-all");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}