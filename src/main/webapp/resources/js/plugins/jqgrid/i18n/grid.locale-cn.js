/**
 * jqGrid Chinese Translation
 * 咖啡兔 yanhonglei@gmail.com
 * http://www.kafeitu.me
 * Dual licensed under the MIT and GPL licenses:
 * http://www.opensource.org/licenses/mit-license.php
 * http://www.gnu.org/licenses/gpl.html
**/
/*global jQuery, define */
(function( factory ) {
	"use strict";
	if ( typeof define === "function" && define.amd ) {
		// AMD. Register as an anonymous module.
		define([
			"jquery",
			"../grid.base"
		], factory );
	} else {
		// Browser globals
		factory( jQuery );
	}
}(function( $ ) {

$.jgrid = $.jgrid || {};
if(!$.jgrid.hasOwnProperty("regional")) {
	$.jgrid.regional = [];
}
$.jgrid.regional["cn"] = {
    defaults : {
        recordtext: "{0} - {1}\u3000\u5171 {2} \u6761", // 共字前是全角空格
        emptyrecords: "\u65e0\u6570\u636e\u663e\u793a",
        loadtext: "\u8bfb\u53d6\u4e2d\u002e\u002e\u002e",
		savetext: "Saving...",
        pgtext : " {0} \u5171 {1} \u9875",
		pgfirst : "First Page",
		pglast : "Last Page",
		pgnext : "Next Page",
		pgprev : "Previous Page",
		pgrecs : "Records per Page",
		showhide: "Toggle Expand Collapse Grid",
		// mobile
		pagerCaption : "Grid::Page Settings",
		pageText : "Page:",
		recordPage : "Records per Page",
		nomorerecs : "No more records...",
		scrollPullup: "Pull up to load more...",
		scrollPulldown : "Pull down to refresh...",
		scrollRefresh : "Release to refresh..."
    },
    search : {
        caption: "\u641c\u7d22\u002e\u002e\u002e",
        Find: "\u67e5\u627e",
        Reset: "\u91cd\u7f6e",
        odata: [{ oper:'eq', text:'\u7b49\u4e8e\u3000\u3000'},{ oper:'ne', text:'\u4e0d\u7b49\u3000\u3000'},{ oper:'lt', text:'\u5c0f\u4e8e\u3000\u3000'},{ oper:'le', text:'\u5c0f\u4e8e\u7b49\u4e8e'},{ oper:'gt', text:'\u5927\u4e8e\u3000\u3000'},{ oper:'ge', text:'\u5927\u4e8e\u7b49\u4e8e'},{ oper:'bw', text:'\u5f00\u59cb\u4e8e'},{ oper:'bn', text:'\u4e0d\u5f00\u59cb\u4e8e'},{ oper:'in', text:'\u5c5e\u4e8e\u3000\u3000'},{ oper:'ni', text:'\u4e0d\u5c5e\u4e8e'},{ oper:'ew', text:'\u7ed3\u675f\u4e8e'},{ oper:'en', text:'\u4e0d\u7ed3\u675f\u4e8e'},{ oper:'cn', text:'\u5305\u542b\u3000\u3000'},{ oper:'nc', text:'\u4e0d\u5305\u542b'},{ oper:'nu', text:'\u4e0d\u5b58\u5728'},{ oper:'nn', text:'\u5b58\u5728'}],
        groupOps: [ { op: "AND", text: "\u6240\u6709" },    { op: "OR",  text: "\u4efb\u4e00" } ],
		operandTitle : "Click to select search operation.",
		resetTitle : "Reset Search Value"
    },
    edit : {
        addCaption: "\u6dfb\u52a0\u8bb0\u5f55",
        editCaption: "\u7f16\u8f91\u8bb0\u5f55",
        bSubmit: "\u63d0\u4ea4",
        bCancel: "\u53d6\u6d88",
        bClose: "\u5173\u95ed",
        saveData: "\u6570\u636e\u5df2\u6539\u53d8\uff0c\u662f\u5426\u4fdd\u5b58\uff1f",
        bYes : "\u662f",
        bNo : "\u5426",
        bExit : "\u53d6\u6d88",
        msg: {
            required:"\u6b64\u5b57\u6bb5\u5fc5\u9700",
            number:"\u8bf7\u8f93\u5165\u6709\u6548\u6570\u5b57",
            minValue:"\u8f93\u503c\u5fc5\u987b\u5927\u4e8e\u7b49\u4e8e ",
            maxValue:"\u8f93\u503c\u5fc5\u987b\u5c0f\u4e8e\u7b49\u4e8e ",
            email: "\u8fd9\u4e0d\u662f\u6709\u6548\u7684\u0065\u002d\u006d\u0061\u0069\u006c\u5730\u5740",
            integer: "\u8bf7\u8f93\u5165\u6709\u6548\u6574\u6570",
            date: "\u8bf7\u8f93\u5165\u6709\u6548\u65f6\u95f4",
            url: "\u65e0\u6548\u7f51\u5740\u3002\u524d\u7f00\u5fc5\u987b\u4e3a\u0020\u0028\u0027\u0068\u0074\u0074\u0070\u003a\u002f\u002f\u0027\u0020\u6216\u0020\u0027\u0068\u0074\u0074\u0070\u0073\u003a\u002f\u002f\u0027\u0029",
            nodefined : " \u672a\u5b9a\u4e49\uff01",
            novalue : " \u9700\u8981\u8fd4\u56de\u503c\uff01",
            customarray : "\u81ea\u5b9a\u4e49\u51fd\u6570\u9700\u8981\u8fd4\u56de\u6570\u7ec4\uff01",
            customfcheck : "\u5fc5\u987b\u6709\u81ea\u5b9a\u4e49\u51fd\u6570\u0021"
        }
    },
    view : {
        caption: "\u67e5\u770b\u8bb0\u5f55",
        bClose: "\u5173\u95ed"
    },
    del : {
        caption: "\u5220\u9664",
        msg: "\u5220\u9664\u6240\u9009\u8bb0\u5f55\uff1f",
        bSubmit: "\u5220\u9664",
        bCancel: "\u53d6\u6d88"
    },
    nav : {
        edittext: "",
        edittitle: "\u7f16\u8f91\u6240\u9009\u8bb0\u5f55",
        addtext:"",
        addtitle: "\u6dfb\u52a0\u65b0\u8bb0\u5f55",
        deltext: "",
        deltitle: "\u5220\u9664\u6240\u9009\u8bb0\u5f55",
        searchtext: "",
        searchtitle: "\u67e5\u627e",
        refreshtext: "",
        refreshtitle: "\u5237\u65b0\u8868\u683c",
        alertcap: "\u6ce8\u610f",
        alerttext: "\u8bf7\u9009\u62e9\u8bb0\u5f55",
        viewtext: "",
        viewtitle: "\u67e5\u770b\u6240\u9009\u8bb0\u5f55",
		savetext: "",
		savetitle: "Save row",
		canceltext: "",
		canceltitle : "Cancel row editing",
		selectcaption : "Actions..."
    },
    col : {
        caption: "\u9009\u62e9\u5217",
        bSubmit: "\u786e\u5b9a",
        bCancel: "\u53d6\u6d88"
    },
    errors : {
        errcap : "\u9519\u8bef",
        nourl : "\u6ca1\u6709\u8bbe\u7f6eurl",
        norecords: "\u6ca1\u6709\u8981\u5904\u7406\u7684\u8bb0\u5f55",
        model : "colNames \u548c colModel \u957f\u5ea6\u4e0d\u7b49\uff01"
    },
    formatter : {
        integer : {thousandsSeparator: ",", defaultValue: '0'},
        number : {decimalSeparator:".", thousandsSeparator: ",", decimalPlaces: 2, defaultValue: '0.00'},
        currency : {decimalSeparator:".", thousandsSeparator: ",", decimalPlaces: 2, prefix: "", suffix:"", defaultValue: '0.00'},
        date : {
            dayNames:   [
                "\u65e5", "\u4e00", "\u4e8c", "\u4e09", "\u56db", "\u4e94", "\u516d",
                "\u661f\u671f\u65e5", "\u661f\u671f\u4e00", "\u661f\u671f\u4e8c", "\u661f\u671f\u4e09", "\u661f\u671f\u56db", "\u661f\u671f\u4e94", "\u661f\u671f\u516d",
            ],
            monthNames: [
                "\u4e00", "\u4e8c", "\u4e09", "\u56db", "\u4e94", "\u516d", "\u4e03", "\u516b", "\u4e5d", "\u5341", "\u5341\u4e00", "\u5341\u4e8c",
                "\u4e00\u6708", "\u4e8c\u6708", "\u4e09\u6708", "\u56db\u6708", "\u4e94\u6708", "\u516d\u6708", "\u4e03\u6708", "\u516b\u6708", "\u4e5d\u6708", "\u5341\u6708", "\u5341\u4e00\u6708", "\u5341\u4e8c\u6708"
            ],
            AmPm : ["am","pm","\u4e0a\u5348","\u4e0b\u5348"],
            S: function (j) {return j < 11 || j > 13 ? ['st', 'nd', 'rd', 'th'][Math.min((j - 1) % 10, 3)] : 'th';},
            srcformat: 'Y-m-d',
            newformat: 'Y-m-d',
            parseRe : /[#%\\\/:_;.,\t\s-]/,
            masks : {
                // see http://php.net/manual/en/function.date.php for PHP format used in jqGrid
                // and see http://docs.jquery.com/UI/Datepicker/formatDate
                // and https://github.com/jquery/globalize#dates for alternative formats used frequently
                // one can find on https://github.com/jquery/globalize/tree/master/lib/cultures many
                // information about date, time, numbers and currency formats used in different countries
                // one should just convert the information in PHP format
                ISO8601Long:"Y-m-d H:i:s",
                ISO8601Short:"Y-m-d",
                // short date:
                //    n - Numeric representation of a month, without leading zeros
                //    j - Day of the month without leading zeros
                //    Y - A full numeric representation of a year, 4 digits
                // example: 3/1/2012 which means 1 March 2012
                ShortDate: "n/j/Y", // in jQuery UI Datepicker: "M/d/yyyy"
                // long date:
                //    l - A full textual representation of the day of the week
                //    F - A full textual representation of a month
                //    d - Day of the month, 2 digits with leading zeros
                //    Y - A full numeric representation of a year, 4 digits
                LongDate: "l, F d, Y", // in jQuery UI Datepicker: "dddd, MMMM dd, yyyy"
                // long date with long time:
                //    l - A full textual representation of the day of the week
                //    F - A full textual representation of a month
                //    d - Day of the month, 2 digits with leading zeros
                //    Y - A full numeric representation of a year, 4 digits
                //    g - 12-hour format of an hour without leading zeros
                //    i - Minutes with leading zeros
                //    s - Seconds, with leading zeros
                //    A - Uppercase Ante meridiem and Post meridiem (AM or PM)
                FullDateTime: "l, F d, Y g:i:s A", // in jQuery UI Datepicker: "dddd, MMMM dd, yyyy h:mm:ss tt"
                // month day:
                //    F - A full textual representation of a month
                //    d - Day of the month, 2 digits with leading zeros
                MonthDay: "F d", // in jQuery UI Datepicker: "MMMM dd"
                // short time (without seconds)
                //    g - 12-hour format of an hour without leading zeros
                //    i - Minutes with leading zeros
                //    A - Uppercase Ante meridiem and Post meridiem (AM or PM)
                ShortTime: "g:i A", // in jQuery UI Datepicker: "h:mm tt"
                // long time (with seconds)
                //    g - 12-hour format of an hour without leading zeros
                //    i - Minutes with leading zeros
                //    s - Seconds, with leading zeros
                //    A - Uppercase Ante meridiem and Post meridiem (AM or PM)
                LongTime: "g:i:s A", // in jQuery UI Datepicker: "h:mm:ss tt"
                SortableDateTime: "Y-m-d\\TH:i:s",
                UniversalSortableDateTime: "Y-m-d H:i:sO",
                // month with year
                //    Y - A full numeric representation of a year, 4 digits
                //    F - A full textual representation of a month
                YearMonth: "F, Y" // in jQuery UI Datepicker: "MMMM, yyyy"
            },
            reformatAfterEdit : false,
			userLocalTime : false
        },
        baseLinkUrl: '',
        showAction: '',
        target: '',
        checkbox : {disabled:true},
        idName : 'id'
    }
};
}));
