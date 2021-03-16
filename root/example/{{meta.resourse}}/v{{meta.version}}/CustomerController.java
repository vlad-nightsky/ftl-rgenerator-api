package {{meta.package}}.{{meta.resource}}.v{{meta.version}};

import com.rcore.domain.commons.usecase.UseCaseExecutor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class {{meta.title}}Controller implements {{meta.title}}Resource{

    private final UseCaseExecutor useCaseExecutor;
}
