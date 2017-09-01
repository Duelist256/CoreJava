package day170901.annotations;

import java.lang.annotation.Annotation;

@MyAnno
public class AnnotationExamples {
    @MyAnno
    public static void main(String[] args) {
        @MyAnno
        Class<AnnotationExamples> clazz = AnnotationExamples.class;
        Annotation[] annotations = clazz.getAnnotations();
        
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

    @MyAnno
    int field = 5;
}
