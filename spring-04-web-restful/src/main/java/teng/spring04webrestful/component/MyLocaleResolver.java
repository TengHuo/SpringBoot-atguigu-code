package teng.spring04webrestful.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l = request.getParameter("lx");
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(l)) {
            String[] langCountry = l.split("_");
            locale = new Locale(langCountry[0], langCountry[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {}
}
