package {{meta.package}}.{{meta.resource}}.v{{meta.version}};

import com.rcore.rest.api.commons.routes.BaseRoutes;

public class Routes {
    public static final String ROOT = BaseRoutes.API + BaseRoutes.V1 + "/{{meta.resource}}";
}
