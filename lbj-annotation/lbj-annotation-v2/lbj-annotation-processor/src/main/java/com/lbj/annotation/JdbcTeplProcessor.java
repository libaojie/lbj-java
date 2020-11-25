package com.lbj.annotation;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("com.lbj.annotation.JdbcTepl")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class JdbcTeplProcessor extends AbstractProcessor {

    // 打印log
    private Messager messager;

    // 抽象语法树
//    private JavacTrees trees;

    /**
     * 初始化方法
     * @param
     */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv){
        super.init(processingEnv);
        this.messager = processingEnv.getMessager();
//        this.trees
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }
}
