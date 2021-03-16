package {{meta.package}}.{{meta.resource}}.v{{meta.version}};

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "{{documentation.tag}}", description = "{{documentation.description}}")
@RestController
public interface {{meta.title}}Resource {

}
