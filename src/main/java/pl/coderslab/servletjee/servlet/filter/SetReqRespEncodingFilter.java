package pl.coderslab.servletjee.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

public class SetReqRespEncodingFilter implements Filter {
    private String reqRespEncoding = "UTF-8";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        servletRequest.setCharacterEncoding(this.reqRespEncoding);
        servletResponse.setCharacterEncoding(this.reqRespEncoding);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        final String reqRespEncoding = filterConfig.getInitParameter("reqRespEncoding");
        if(reqRespEncoding!=null){
            this.reqRespEncoding = reqRespEncoding;
        }

        System.out.println("Set requ resp encoding: " + this.reqRespEncoding);
    }

    @Override
    public void destroy() {

    }
}
