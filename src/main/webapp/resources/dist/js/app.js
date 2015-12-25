Ajax.Responders.register({
	onCreate : function() {
		$('loader-el').setStyle({
			visibility : 'visible'
		});
	},
	onComplete : function() {
		$('loader-el').setStyle({
			visibility : 'hidden'
		});
	}
});
document.observe('click', function(event) {
	var element = Event.element(event);
	if (element.target == ""){
		element.target = 'container';
	}
	if (element.hasClassName("ajaxlink")) {
		event.stop();
		new Ajax.Updater(element.target, element.href, {
			method : 'get',
			evalScripts : true
		});
	}
});
document.observe('submit', function(event) {
	var element = Event.element(event);
	if (element.hasClassName("ajaxform")) {
		event.stop();
		$(element.id).request({
			onFailure : function() {
			},
			onSuccess : function(response) {
				var rep = response.responseText.evalJSON();
				if (rep.status === false) {
					$('div-field-name').addClassName('has-error');
				} else {
					if (rep.redirectUrl !== null){
						new Ajax.Updater('container', rep.redirectUrl, {
							method : 'get',
							evalScripts : true
						});
					}
				}
			}
		});
		;
	}

});
function call(url, methode, target) {
	new Ajax.Updater(target, url, {
		method : methode,
		evalScripts : true
	});
}
