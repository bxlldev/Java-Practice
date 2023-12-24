import java.lang.reflect.Method;

public class Processor {
    public static void processorAnnotation(Object target){
        Class<?> clazz = target.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods){
            GetMapping getMapping = method.getAnnotation(GetMapping.class);
            if (getMapping != null){
                System.out.println("Do somthing here - GetMapping:: " + method.getName());
            }
        }

    }
    
}
