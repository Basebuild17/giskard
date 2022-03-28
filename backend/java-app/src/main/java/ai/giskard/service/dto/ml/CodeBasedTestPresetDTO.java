package ai.giskard.service.dto.ml;

import ai.giskard.domain.ml.CodeLanguage;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

public class CodeBasedTestPresetDTO {
    @lombok.Setter
    @lombok.Getter
    private Long id;

    @Getter
    @Setter
    @NotNull
    private String name;

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private CodeLanguage language;
}
