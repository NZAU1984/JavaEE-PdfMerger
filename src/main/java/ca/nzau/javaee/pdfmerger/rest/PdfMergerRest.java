package ca.nzau.javaee.pdfmerger.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Handles all {@code REST} calls.
 * <p>
 *     {@code web.xml} contains instructions to map the path {@code /rest} (relative to the application context root) to
 *     the package {@link ca.nzau.javaee.pdfmerger.rest}. The {@link Path} annotation used here specifies that the path
 *     {@code /} (relative to the {@code web.xml} configuration) is linked to this class. Therefore, this class matches
 *     the path {@code <application context root>/rest/}.
 * </p>
 *
 * @author  Hubert Lemelin
 */

@Path("/")
public class PdfMergerRest
{
    /**
     * Matches the path {@code <application context root>/rest/} and the {@code GET} method and returns a simple
     * {@code Hello World} message.
     *
     * @return  a simple {@code Hello World} message.
     */
    @GET
    public String helloWorld()
    {
        return "Hello World from PdfMergerRest";
    }
}
