
package com.sun.jna.platform.win32.COM.util.office.word;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({000209F4-0000-0000-C000-000000000046})</p>
 * <p>interface(_ParagraphFormat)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{000209F4-0000-0000-C000-000000000046}")
public interface ParagraphFormat extends
    _ParagraphFormat,
    IUnknown
{

}