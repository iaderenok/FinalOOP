package Core.MVP;

import java.io.IOException;

public class View{ 
    public static void ButtonClick() throws IOException {
        try{
    Runtime.getRuntime().exec("cmd start Model.java");
    Runtime.getRuntime().exec("cmd start Presenter.java");
        }catch (Exception e){
            System.out.println("не прошло");
        }
}
}
