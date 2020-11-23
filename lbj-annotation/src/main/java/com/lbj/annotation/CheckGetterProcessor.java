package com.lbj.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;
import java.util.Set;


@SupportedAnnotationTypes("com.lbj.annotation.CheckGetter")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class CheckGetterProcessor extends AbstractProcessor {

    public CheckGetterProcessor(){}

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // annotations：该注解处理器所能处理的注解类型
        // roundEnv：囊括当前轮生成的抽象语法树RoundEnvironment
        // roundEnv.getElementsAnnotatedWith(CheckGetter.class)
        for (TypeElement annotatedClass : ElementFilter.typesIn(roundEnv.getElementsAnnotatedWith(CheckGetter.class))) {
            for (VariableElement field : ElementFilter.fieldsIn(annotatedClass.getEnclosedElements())) {
                if (!containsGetter(annotatedClass, field.getSimpleName().toString())) {
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR,
                            String.format("getter not fund for '%s.%s'.", annotatedClass.getSimpleName(),
                                    field.getSimpleName()));
                }
            }
        }
        return false;
    }

    private static boolean containsGetter(TypeElement typeElement, String name) {
        // 拼接getter名称
        String getter = "get" + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        for (ExecutableElement executableElement : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
            if (!executableElement.getModifiers().contains(Modifier.STATIC)
                    && executableElement.getSimpleName().toString().equals(getter)
                    && executableElement.getParameters().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
