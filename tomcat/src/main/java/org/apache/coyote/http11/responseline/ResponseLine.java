package org.apache.coyote.http11.responseline;

public class ResponseLine {

  private static final String HTTP_1_1 = "HTTP/1.1";

  private final String version;
  private HttpStatus status;

  public ResponseLine(final String version, final HttpStatus status) {
    this.version = version;
    this.status = status;
  }

  public ResponseLine(final HttpStatus status) {
    this(HTTP_1_1, status);
  }

  public ResponseLine() {
    this(HTTP_1_1, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  public String build() {
    return version + " " + status.build();
  }

  public void setStatus(final HttpStatus status) {
    this.status = status;
  }
}
