package com.mind.links.common.enums;

import org.springframework.http.MediaType;
import java.util.*;


/**
 * description : TODO 请求头枚举
 *
 * @author : qiDing
 * date: 2020-12-29 08:05
 * @version v1.0.0
 */

public enum LinksContentTypeEnum {
    /**
     * 上传文件请求头枚举
     */
    JPG(".jpg", MediaType.IMAGE_JPEG_VALUE),
    GIF(".gif", MediaType.IMAGE_GIF_VALUE),
    PNG(".png", MediaType.IMAGE_PNG_VALUE);

    private final String suffix;
    private final String headers;

    LinksContentTypeEnum(String suffix, String headers) {
        this.suffix = suffix;
        this.headers = headers;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getHeaders() {
        return headers;
    }

    public static void setHeaders(String filename, Map<String, String> headers) {
        Optional.ofNullable(filename)
                .ifPresent(s -> Arrays.stream(values())
                .filter(e -> (s.toLowerCase()).contains(e.suffix))
                .forEach(e -> headers.put("Content-Type",e.headers))
        );
    }
}
