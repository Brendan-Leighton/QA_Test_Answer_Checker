package answers;
// CUSTOM HELPERS
import helper.Answer;

/**
 * Answers & Questions for general API things.
 */
public class Answers_API_Overview extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[]{
                new Answer(
                        "API001",
                        "API001: What is the meaning of the status codes in the 100's?",
                        "helper.Answer: Informational",
                        new String[]{
                                "Informational"
                        }),

                new Answer(
                        "API002",
                        "API002: What is the meaning of the status codes in the 200's?",
                        "helper.Answer: Success",
                        new String[]{
                                "Success"
                        }),

                new Answer(
                        "API003",
                        "API003: What is the meaning of the status codes in the 300's?",
                        "helper.Answer: Redirect",
                        new String[]{
                                "Redirect"
                        }),

                new Answer(
                        "API004",
                        "API004: What is the meaning of the status codes in the 400's?",
                        "helper.Answer: Client Error",
                        new String[]{
                                "Client"
                        }),

                new Answer(
                        "API005",
                        "API005: What is the meaning of the status codes in the 500's?",
                        "helper.Answer: Server Error",
                        new String[]{
                                "Server"
                        }),

                new Answer(
                        "API006",
                        "API006: What goes in the header of a RESTful API request?",
                        "Answers:\n" +
                                "- Authorization: Carries credentials containing the authentication information of the client for the resource being requested.\n" +
                                "\n" +
                                "- WWW-Authenticate: This is sent by the server if it needs a form of authentication before it can respond with the actual resource being requested. Often sent along with a response code of 401, which means ‘unauthorized’.\n" +
                                "\n" +
                                "- Accept-Charset: This is a header which is set with the request and tells the server about which character sets are acceptable by the client.\n" +
                                "\n" +
                                "- Content-Type: Indicates the media type (text/html or text/JSON) of the response sent to the client by the server, this will help the client in processing the response body correctly.\n" +
                                "\n" +
                                "- Cache-Control: This is the cache policy defined by the server for this response, a cached response can be stored by the client and re-used till the time defined by the Cache-Control header.",
                        new String[]{
                                "Authorization",
                                "WWW-Authenticate",
                                "WWW Authenticate",
                                "Authenticate",
                                "Accept-Charset",
                                "Accept Charset",
                                "Content-Type",
                                "Content Type",
                                "Cache-Control",
                                "Cache Control"
                        })
        };
    }
}