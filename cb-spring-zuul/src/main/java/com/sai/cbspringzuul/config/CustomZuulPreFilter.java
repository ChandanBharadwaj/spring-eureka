package com.sai.cbspringzuul.config;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
@Component
public class CustomZuulPreFilter extends ZuulFilter  {

	@Override
	public Object run() {
		 RequestContext ctx = RequestContext.getCurrentContext();
		 ctx.addZuulRequestHeader("Test", "TestSample");
		 if(ctx.getRequest().getHeader("myHeader")!=null) {
			 System.out.println( ctx.getRequest().getHeader("myHeader"));
			 ctx.setSendZuulResponse(false);
			 ctx.setResponseBody("dfjkgjsdlgl");
			 ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
			 ctx.unset();
		 }
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

}
