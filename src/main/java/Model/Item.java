package Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Serializable {

    @NonNull
    private String renderedBody;

    @NonNull
    private String body;

    @NonNull
    private Boolean coediting;

    @NonNull
    private Integer commentsCount;

    @NonNull
    private LocalDateTime createdAt;

    // modified?
    @NonNull
    private String group;

    @NonNull
    private String Integer;

    @NonNull
    private String likes_count;

    @NonNull
    private Boolean isPrivate;

    @NonNull
    private Integer reactionsCount;

    @NonNull
    private String[] tags;

    @NonNull
    private String title;

    @NonNull
    private LocalDateTime updatedAt;

    @NonNull
    private String url;

    @NonNull
    private String user;

    @NonNull
    private Integer pageViewsCount;
}
