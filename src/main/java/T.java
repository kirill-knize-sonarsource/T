import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.rmi.server.ServerCloneException;
import java.util.*;

public class T {

    Object currentObj = null;

    private static Object getObject(Object obj) {
        Object o = obj;
        while (o != null) {
            o = getObject(obj);
        }
        return o;
    }

    private T() {
        Object obj = getObject(currentObj);
        System.out.println(obj.toString());
    }

    private void Foo() {
        String s = "AAAAAAAAAAAAAAAA";
        String s2 = "AAAAAAAAAAAAAAAA";
        String s3 = "AAAAAAAAAAAAAAAA";
        String s4 = "AAAAAAAAAAAAAAAA";
        String s5 = "AAAAAAAAAAAAAAAA";
        System.out.printf(s + s2 + s3 + s4 + s5);
    }



}