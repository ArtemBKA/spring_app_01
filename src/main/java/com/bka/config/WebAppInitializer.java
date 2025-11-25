package com.bka.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
// Томкат находит этот класс, и создает два
// контекста для вэб-компонентов и бизнес-компонентов
// Регистрирует диспетчер сервлет.
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Конфигурация для корневого контекста (не-web компоненты: сервисы, репозитории)
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { RootConfig.class };
    }

    // Конфигурация для веб-контекста (контроллеры, view resolvers)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    // Маппинг DispatcherServlet
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}